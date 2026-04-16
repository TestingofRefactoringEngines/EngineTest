class A{
        private static InputStream getInputUnchecked(InputSupplier<InputStream> inputSupplier)
        {
            InputStream in;
            try {
                in = inputSupplier.getInput();
            }
            catch (IOException e) {
                throw Throwables.propagate(e);
            }
            return in;
        }
}