org.eclipse.jdt.internal.corext.Assert$AssertionFailedException: assertion failed; 
	at org.eclipse.jdt.internal.corext.Assert.isTrue(Assert.java:139)
	at org.eclipse.jdt.internal.corext.Assert.isTrue(Assert.java:124)
	at
org.eclipse.jdt.internal.corext.refactoring.code.InlineMethodRefactoring.setCurrentMode(InlineMethodRefactoring.java:166)
	at
org.eclipse.jdt.internal.ui.refactoring.code.InlineMethodInputPage.changeRefactoring(InlineMethodInputPage.java:111)
	at
org.eclipse.jdt.internal.ui.refactoring.code.InlineMethodInputPage.access$1(InlineMethodInputPage.java:108)
	at
org.eclipse.jdt.internal.ui.refactoring.code.InlineMethodInputPage$1.widgetSelected(InlineMethodInputPage.java:73)
	at org.eclipse.swt.widgets.TypedListener.handleEvent(TypedListener.java:89)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:82)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:842)
	at org.eclipse.swt.widgets.Display.runDeferredEvents(Display.java:2894)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:2527)
	at org.eclipse.jface.window.Window.runEventLoop(Window.java:803)
	at org.eclipse.jface.window.Window.open(Window.java:781)
	at
org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation$1.run(RefactoringWizardOpenOperation.java:125)
	at org.eclipse.swt.custom.BusyIndicator.showWhile(BusyIndicator.java:69)
	at
org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation.run(RefactoringWizardOpenOperation.java:138)
	at
org.eclipse.jdt.internal.ui.refactoring.actions.RefactoringStarter.activate(RefactoringStarter.java:40)
	at
org.eclipse.jdt.internal.ui.refactoring.actions.InlineMethodAction.run(InlineMethodAction.java:137)
	at
org.eclipse.jdt.internal.ui.refactoring.actions.InlineMethodAction.run(InlineMethodAction.java:124)
	at org.eclipse.jdt.ui.actions.InlineAction.tryInlineMethod(InlineAction.java:143)
	at org.eclipse.jdt.ui.actions.InlineAction.run(InlineAction.java:116)
	at
org.eclipse.jdt.ui.actions.SelectionDispatchAction.dispatchRun(SelectionDispatchAction.java:216)
	at
org.eclipse.jdt.ui.actions.SelectionDispatchAction.run(SelectionDispatchAction.java:188)
	at org.eclipse.jface.action.Action.runWithEvent(Action.java:996)
	at org.eclipse.ui.commands.ActionHandler.execute(ActionHandler.java:182)
	at
org.eclipse.ui.internal.handlers.LegacyHandlerWrapper.execute(LegacyHandlerWrapper.java:108)
	at org.eclipse.core.commands.Command.execute(Command.java:331)
	at
org.eclipse.core.commands.ParameterizedCommand.execute(ParameterizedCommand.java:396)
	at
org.eclipse.ui.internal.keys.WorkbenchKeyboard.executeCommand(WorkbenchKeyboard.java:452)
	at org.eclipse.ui.internal.keys.WorkbenchKeyboard.press(WorkbenchKeyboard.java:741)
	at
org.eclipse.ui.internal.keys.WorkbenchKeyboard.processKeyEvent(WorkbenchKeyboard.java:784)
	at
org.eclipse.ui.internal.keys.WorkbenchKeyboard.filterKeySequenceBindings(WorkbenchKeyboard.java:543)
	at
org.eclipse.ui.internal.keys.WorkbenchKeyboard.access$3(WorkbenchKeyboard.java:486)
	at
org.eclipse.ui.internal.keys.WorkbenchKeyboard$KeyDownFilter.handleEvent(WorkbenchKeyboard.java:110)
	at org.eclipse.swt.widgets.EventTable.sendEvent(EventTable.java:82)
	at org.eclipse.swt.widgets.Display.filterEvent(Display.java:777)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:841)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:866)
	at org.eclipse.swt.widgets.Widget.sendEvent(Widget.java:851)
	at org.eclipse.swt.widgets.Control.traverse(Control.java:2770)
	at org.eclipse.swt.widgets.Control.translateMnemonic(Control.java:2611)
	at org.eclipse.swt.widgets.Composite.translateMnemonic(Composite.java:813)
	at org.eclipse.swt.widgets.Control.translateMnemonic(Control.java:2629)
	at org.eclipse.swt.widgets.Display.translateMnemonic(Display.java:3314)
	at org.eclipse.swt.widgets.Display.filterMessage(Display.java:791)
	at org.eclipse.swt.widgets.Display.readAndDispatch(Display.java:2523)
	at org.eclipse.ui.internal.Workbench.runEventLoop(Workbench.java:1570)
	at org.eclipse.ui.internal.Workbench.runUI(Workbench.java:1534)
	at org.eclipse.ui.internal.Workbench.createAndRunWorkbench(Workbench.java:306)
	at org.eclipse.ui.PlatformUI.createAndRunWorkbench(PlatformUI.java:143)
	at org.eclipse.ui.internal.ide.IDEApplication.run(IDEApplication.java:103)
	at
org.eclipse.core.internal.runtime.PlatformActivator$1.run(PlatformActivator.java:228)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:344)
	at org.eclipse.core.runtime.adaptor.EclipseStarter.run(EclipseStarter.java:156)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:85)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:58)
	at
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:60)
	at java.lang.reflect.Method.invoke(Method.java:391)
	at org.eclipse.core.launcher.Main.invokeFramework(Main.java:315)
	at org.eclipse.core.launcher.Main.basicRun(Main.java:268)
	at org.eclipse.core.launcher.Main.run(Main.java:947)
	at org.eclipse.core.launcher.Main.main(Main.java:931)