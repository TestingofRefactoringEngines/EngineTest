public Item[] getChildren(Widget widget, Object[] elementChildren) {
		Item[] items = super.getChildren(widget,elementChildren);
		if(elementChildren.length == 0 || items.length / elementChildren.length > 5){//Will there be a lot of disposal?
			getTree().removeAll();
			unmapAllElements();
			items =  getChildren(widget);
		}
		return items;
	}