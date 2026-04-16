interface Schema {
	// To see the error
	// select Layout -> right click to get context menu, Refactor -> Move Type to a New File
	// an extra import com.github.forax.tomahawk.schema.Schema.Layout.PrimitiveLayout;
  interface Layout {
    default boolean isPrimitive() {
      return this instanceof PrimitiveLayout;
    }
    record PrimitiveLayout() implements Layout { }
  }
}