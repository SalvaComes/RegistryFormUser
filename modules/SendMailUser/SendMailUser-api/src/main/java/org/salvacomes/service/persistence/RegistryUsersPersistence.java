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

package org.salvacomes.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

import org.salvacomes.exception.NoSuchRegistryUsersException;
import org.salvacomes.model.RegistryUsers;

/**
 * The persistence interface for the registry users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistryUsersUtil
 * @generated
 */
@ProviderType
public interface RegistryUsersPersistence
	extends BasePersistence<RegistryUsers> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RegistryUsersUtil} to access the registry users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the registry users in the entity cache if it is enabled.
	 *
	 * @param registryUsers the registry users
	 */
	public void cacheResult(RegistryUsers registryUsers);

	/**
	 * Caches the registry userses in the entity cache if it is enabled.
	 *
	 * @param registryUserses the registry userses
	 */
	public void cacheResult(java.util.List<RegistryUsers> registryUserses);

	/**
	 * Creates a new registry users with the primary key. Does not add the registry users to the database.
	 *
	 * @param id the primary key for the new registry users
	 * @return the new registry users
	 */
	public RegistryUsers create(int id);

	/**
	 * Removes the registry users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users that was removed
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	public RegistryUsers remove(int id) throws NoSuchRegistryUsersException;

	public RegistryUsers updateImpl(RegistryUsers registryUsers);

	/**
	 * Returns the registry users with the primary key or throws a <code>NoSuchRegistryUsersException</code> if it could not be found.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	public RegistryUsers findByPrimaryKey(int id)
		throws NoSuchRegistryUsersException;

	/**
	 * Returns the registry users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users, or <code>null</code> if a registry users with the primary key could not be found
	 */
	public RegistryUsers fetchByPrimaryKey(int id);

	/**
	 * Returns all the registry userses.
	 *
	 * @return the registry userses
	 */
	public java.util.List<RegistryUsers> findAll();

	/**
	 * Returns a range of all the registry userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RegistryUsersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registry userses
	 * @param end the upper bound of the range of registry userses (not inclusive)
	 * @return the range of registry userses
	 */
	public java.util.List<RegistryUsers> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the registry userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RegistryUsersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registry userses
	 * @param end the upper bound of the range of registry userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of registry userses
	 */
	public java.util.List<RegistryUsers> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistryUsers>
			orderByComparator);

	/**
	 * Returns an ordered range of all the registry userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>RegistryUsersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registry userses
	 * @param end the upper bound of the range of registry userses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of registry userses
	 */
	public java.util.List<RegistryUsers> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RegistryUsers>
			orderByComparator,
		boolean retrieveFromCache);

	/**
	 * Removes all the registry userses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of registry userses.
	 *
	 * @return the number of registry userses
	 */
	public int countAll();

}