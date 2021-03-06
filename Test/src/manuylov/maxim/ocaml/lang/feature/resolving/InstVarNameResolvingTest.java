/*
 * OCaml Support For IntelliJ Platform.
 * Copyright (C) 2010 Maxim Manuylov
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */

package manuylov.maxim.ocaml.lang.feature.resolving;

import manuylov.maxim.ocaml.lang.feature.resolving.testCase.ResolvingTestCase;
import org.testng.annotations.Test;

/**
 * @author Maxim.Manuylov
 *         Date: 19.06.2009
 */
@Test
public class InstVarNameResolvingTest extends ResolvingTestCase {
    public void testInstVarNameResolving() throws Exception {
        doTest(1, "" +
             "class clazz = " +
             "object " +
             "  val {{x}} = 12 " +
             "  method m = {< }{x = 10 >} " +
             "end;;");
    }
}