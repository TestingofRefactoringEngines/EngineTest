class A{
    public static void create(Map<String, Metric> metrics) {
        if (!metrics.containsKey("nexus.kernel.Executor.IdleTimePercent")) {
            PositiveDeltaMetric idleTimeDelta = new PositiveDeltaMetric("nexus.kernel.Executor.IdleTimeDelta",
                                                                        metrics.get("nexus.kernel.Executor.IdleTimeNanos"));
            DivideMetric idleTimeDeltaPerThread = new DivideMetric("nexus.kernel.Executor.IdleTimeDeltaPerThread",
                                                                   idleTimeDelta,
                                                                   metrics.get("nexus.kernel.Executor.PoolSize"));
            Metric idleTimePercent = new PercentTimeMetric("nexus.kernel.Executor.IdleTimePercent",
                                                           idleTimeDeltaPerThread);
            metrics.put(idleTimePercent.getName(), idleTimePercent);
        }
    }
}