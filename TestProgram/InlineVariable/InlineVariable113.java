ReferenceBinding declaringClass = method.declaringClass;
if ((declaringClass != null)
	&&(declaringClass.id == getJavaLangInvokeMethodHandle().id||declaringClass.id == getJavaLangInvokeVarHandle().id)) {
	method.tagBits |= TagBits.AnnotationPolymorphicSignature;
}