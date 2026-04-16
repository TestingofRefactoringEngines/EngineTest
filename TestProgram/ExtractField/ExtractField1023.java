class A{
	private boolean isInTypeDeclarationAnnotation(ASTNode node) throws JavaModelException {
		Annotation enclosingAnnotation= ASTNodes.getParent(node, Annotation.class);
		return enclosingAnnotation != null && enclosingAnnotation.getParent() == getContainingTypeDeclarationNode();
	}

	private boolean isInTypeDeclarationAnnotation(ASTNode node) throws JavaModelException {
		Annotation enclosingAnnotation= ASTNodes.getParent(node, Annotation.class);
		AbstractTypeDeclaration result= ASTNodes.getParent(getSelectedExpression().getAssociatedNode(), AbstractTypeDeclaration.class);
		return enclosingAnnotation != null && enclosingAnnotation.getParent() == result;
	}
}