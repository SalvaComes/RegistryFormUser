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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import org.salvacomes.model.RegistryUsers;

/**
 * The persistence utility for the registry users service. This utility wraps <code>org.salvacomes.service.persistence.impl.RegistryUsersPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistryUsersPersistence
 * @generated
 */
@ProviderType
public class RegistryUsersUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(RegistryUsers registryUsers) {
		getPersistence().clearCache(registryUsers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, RegistryUsers> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RegistryUsers> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RegistryUsers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RegistryUsers> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RegistryUsers> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RegistryUsers update(RegistryUsers registryUsers) {
		return getPersistence().update(registryUsers);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RegistryUsers update(
		RegistryUsers registryUsers, ServiceContext serviceContext) {

		return getPersistence().update(registryUsers, serviceContext);
	}

	/**
	 * Caches the registry users in the entity cache if it is enabled.
	 *
	 * @param registryUsers the registry users
	 */
	public static void cacheResult(RegistryUsers registryUsers) {
		getPersistence().cacheResult(registryUsers);
	}

	/**
	 * Caches the registry userses in the entity cache if it is enabled.
	 *
	 * @param registryUserses the registry userses
	 */
	public static void cacheResult(List<RegistryUsers> registryUserses) {
		getPersistence().cacheResult(registryUserses);
	}

	/**
	 * Creates a new registry users with the primary key. Does not add the registry users to the database.
	 *
	 * @param id the primary key for the new registry users
	 * @return the new registry users
	 */
	public static RegistryUsers create(int id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the registry users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users that was removed
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	public static RegistryUsers remove(int id)
		throws org.salvacomes.exception.NoSuchRegistryUsersException {

		return getPersistence().remove(id);
	}

	public static RegistryUsers updateImpl(RegistryUsers registryUsers) {
		return getPersistence().updateImpl(registryUsers);
	}

	/**
	 * Returns the registry users with the primary key or throws a <code>NoSuchRegistryUsersException</code> if it could not be found.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	public static RegistryUsers findByPrimaryKey(int id)
		throws org.salvacomes.exception.NoSuchRegistryUsersException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the registry users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users, or <code>null</code> if a registry users with the primary key could not be found
	 */
	public static RegistryUsers fetchByPrimaryKey(int id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the registry userses.
	 *
	 * @return the registry userses
	 */
	public static List<RegistryUsers> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<RegistryUsers> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<RegistryUsers> findAll(
		int start, int end,
		OrderByComparator<RegistryUsers> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<RegistryUsers> findAll(
		int start, int end, OrderByComparator<RegistryUsers> orderByComparator,
		boolean retrieveFromCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, retrieveFromCache);
	}

	/**
	 * Removes all the registry userses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of registry userses.
	 *
	 * @return the number of registry userses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RegistryUsersPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RegistryUsersPersistence, RegistryUsersPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(RegistryUsersPersistence.class);

		ServiceTracker<RegistryUsersPersistence, RegistryUsersPersistence>
			serviceTracker =
				new ServiceTracker
					<RegistryUsersPersistence, RegistryUsersPersistence>(
						bundle.getBundleContext(),
						RegistryUsersPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}