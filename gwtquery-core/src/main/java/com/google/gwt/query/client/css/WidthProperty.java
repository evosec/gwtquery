/*
 * Copyright 2011, The gwtquery team.
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
package com.google.gwt.query.client.css;

/**
 * This property specifies the content width of boxes generated by block-level
 * and replaced elements.
 * 
 * This property does not apply to non-replaced inline-level elements. The
 * content width of a non-replaced inline element's boxes is that of the
 * rendered content within them (before any relative offset of children). Recall
 * that inline boxes flow into line boxes. The width of line boxes is given by
 * the their containing block, but may be shorted by the presence of floats.
 * 
 * The width of a replaced element's box is intrinsic and may be scaled by the
 * user agent if the value of this property is different than 'auto'.
 */
public class WidthProperty extends AbstractCssProperty<Length> {

  private static final String WIDTH_PROPERTY = "width";
  private static final String MAX_WIDTH_PROPERTY = "maxWidth";
  private static final String MIN_WIDTH_PROPERTY = "minWidth";

  public static void init() {
    CSS.WIDTH = new WidthProperty(WIDTH_PROPERTY);
    CSS.MAX_WIDTH = new WidthProperty(MAX_WIDTH_PROPERTY);
    CSS.MIN_WIDTH = new WidthProperty(MIN_WIDTH_PROPERTY);
  }
  
  private WidthProperty(String cssName) {
    super(cssName);
  }

}
