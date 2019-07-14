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

package org.salvacomes.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the RegistryUsers service. Represents a row in the &quot;RegistryForm&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RegistryUsersModel
 * @generated
 */
@ImplementationClassName("org.salvacomes.model.impl.RegistryUsersImpl")
@ProviderType
public interface RegistryUsers extends PersistedModel, RegistryUsersModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>org.salvacomes.model.impl.RegistryUsersImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RegistryUsers, Integer> ID_ACCESSOR =
		new Accessor<RegistryUsers, Integer>() {

			@Override
			public Integer get(RegistryUsers registryUsers) {
				return registryUsers.getId();
			}

			@Override
			public Class<Integer> getAttributeClass() {
				return Integer.class;
			}

			@Override
			public Class<RegistryUsers> getTypeClass() {
				return RegistryUsers.class;
			}

		};

}