class A {

    public static Logger LOG = Logger.getLogger(AppInterfaceServer.class,
            ServerSettingsConstants.DefaultServerMessagesFileName);

    public void logWarning(String msg) {
        LOG.warn(msg);
    }
}