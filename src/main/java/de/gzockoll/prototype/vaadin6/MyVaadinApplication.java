/*
 * Copyright 2009 IT Mill Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.gzockoll.prototype.vaadin6;

import com.vaadin.Application;
import com.vaadin.addon.beanvalidation.BeanValidationForm;
import com.vaadin.data.util.BeanItem;
import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.Window;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
public class MyVaadinApplication extends Application {
	private Window window;

	@Override
	public void init() {
		// Create the custom bean.
		Person bean = new Person();

		// Create a form and use FormLayout as its layout.
		final Form form = new BeanValidationForm<Person>(bean);

		// Set form caption and description texts
		form.setCaption("Contact Information");
		form.setDescription("Please specify name of the person and the city where the person lives in.");
		form.setWriteThrough(false);

		// Create a bean item that is bound to the bean.
		BeanItem<Person> item = new BeanItem<Person>(bean);

		// Bind the bean item as the data source for the form.
		form.setItemDataSource(item);
		window = new Window("My Vaadin Application");
		setMainWindow(window);
		window.addComponent(form);
		Button commit = new Button("Commit", form, "commit");
		window.addComponent(commit);
		Button restore = new Button("Restore", form, "discard");
		window.addComponent(restore);

	}
}
