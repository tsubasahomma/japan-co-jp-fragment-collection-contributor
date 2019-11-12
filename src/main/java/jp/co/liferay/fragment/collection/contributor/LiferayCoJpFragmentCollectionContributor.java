/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package jp.co.liferay.fragment.collection.contributor;

import com.liferay.fragment.contributor.BaseFragmentCollectionContributor;
import com.liferay.fragment.contributor.FragmentCollectionContributor;

import javax.servlet.ServletContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


/**
 * @author Tsubasa Homma
 */
@Component(service = FragmentCollectionContributor.class)
public class LiferayCoJpFragmentCollectionContributor
        extends BaseFragmentCollectionContributor {

  @Override
  public String getFragmentCollectionKey() {
    return "CO_JP_FRAGMENT_COLLECTION_CONTRIBUTOR";
  }

  @Override
  public ServletContext getServletContext() {
    return _servletContext;
  }

  @Reference(
          target = "(osgi.web.symbolicname=jp.co.liferay.fragment.collection.contributor)"
  )
  private ServletContext _servletContext;

}