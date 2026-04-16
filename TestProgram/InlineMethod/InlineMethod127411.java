 class TextField {
    private final JTextField textField = new JTextField();

    public void onValueSet(ValueSetEvent<?> event) {
        setTextField();
    }

    private void setTextField() {
        textField.setText("foo");
    }
}