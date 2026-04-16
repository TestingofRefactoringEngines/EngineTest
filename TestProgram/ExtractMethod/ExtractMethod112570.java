class A{  
  public static void changeColorAndMakeStringOfOldColors(List<Shape> shapes, Color newColor, StringBuilder stringBuilder) {
        shapes.forEach(shape -> {
            <selection>stringBuilder.append(shape);
            shape.setColor(newColor);</selection>
        });
    }
}