java.lang.reflect.InvocationTargetException
   at org.eclipse.jface.operation.ModalContext.run(ModelContext.java:327)
   at org.eclipse.jface.wizard.WizardDialog.run(WizardDialog.java:830)
   at org.eclipse.ltk.ui.refactoring.RefactoringWizard.createChange(RefactoringWizard.java:573)
   at org.eclipse.ltk.ui.refactoring.RefactoringWizard.computeUserInputSuccessorPage(RefactoringWizard.java:416)
   at org.eclipse.ltk.ui.refactoring.RefactoringWizardPage.computeSuccessorPage(UserInputWizardPage.java:74)
   at org.eclipse.jdt.internal.ui.refactoring.PullUpWizard$PullUpInputPage2.getNextPage(PullUpWizard.java:1150)
   at org.eclipse.jface.wizard.WizardDialg.nextPressed(WizardDialg.java:747)
- and so on - 
Caused by: java.lang.IllegalArgumentException
   at org.eclipse.jdt.core.dom.rewrite.ASTRewrite.createStringPlaceholder(ASTRewrite.java:428)
   at org.eclipse.jdt.internal.context.refactoring.structure.PullUpRefactoring.createJavadocForStub(PullUpRefactoring.java:1035)
   at org.eclipse.jdt.internal.context.refactoring.structure.PullUpRefactoring.addMethodStubsToNonAbstractSubclassesOfTargetClass(PullUpRefactoring.java:415)
   at org.eclipse.jdt.internal.context.refactoring.structure.PullUpRefactoring.createChangeManager(PullUpRefactoring.java:1002)
      at org.eclipse.jdt.internal.context.refactoring.structure.PullUpRefactoring.checkFinalConditions(PullUpRefactoring.java:615)