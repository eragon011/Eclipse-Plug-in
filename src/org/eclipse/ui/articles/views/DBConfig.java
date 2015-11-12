package org.eclipse.ui.articles.views;

import java.awt.Panel;

import org.eclipse.swt.widgets.*;
import org.eclipse.ui.part.ViewPart;

public class DBConfig extends ViewPart {
        private Label label;
        private Panel panel;
        public DBConfig() {
                super();
        }
     public void setFocus() {
                label.setFocus();
        }
     public void createPartControl(Composite parent) {
                label = new Label(parent, 0);
                label.setText("Database Configuration");
        }

}
