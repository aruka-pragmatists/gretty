/*
 * Gretty
 *
 * Copyright (C) 2013-2014 Andrey Hihlovskiy and contributors.
 *
 * See the file "LICENSE" for copying and usage permission.
 * See the file "CONTRIBUTORS" for complete list of contributors.
 */
package org.akhikhl.gretty

import org.apache.commons.io.FilenameUtils

/**
 *
 * @author akhikhl
 */
class WebappUtils {

  static String getWebAppDestinationDirName(String resourceBase) {
    def file = resourceBase
    if(!(file instanceof File))
      file = new File(file.toString())
    FilenameUtils.getBaseName(file.name).replaceAll(/([\da-zA-Z_.-]+?)-((\d+\.)+[\da-zA-Z_.-]*)/, '$1')
  }	
}

