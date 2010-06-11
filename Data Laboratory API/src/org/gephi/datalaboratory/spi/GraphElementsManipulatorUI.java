/*
Copyright 2008-2010 Gephi
Authors : Eduardo Ramos <eduramiba@gmail.com>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.datalaboratory.spi;

import javax.swing.JPanel;

/**
 * UI GraphElementsManipulators can provide.
 * This itself provides a JPanel and a window name/title.
 * @author Eduardo Ramos <eduramiba@gmail.com>
 */
public interface GraphElementsManipulatorUI {

    /**
     * Prepare this UI to be able to interact with its GraphElementsManipulator.
     * @param gem GraphElementsManipulator for the UI
     */
    void setup(GraphElementsManipulator gem);

    /**
     * Called when the window is closed or accepted.
     */
    void unSetup();

    /**
     * Returns name/title for the window
     * @return Name/title for the window
     */
    String getDisplayName();

    /**
     * Returns a settings panel instance for this GraphElementsManipulator.
     * @return Settings panel instance
     */
    public JPanel getSettingsPanel();
}
