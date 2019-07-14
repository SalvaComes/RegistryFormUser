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

package org.salvacomes.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link RegistryUsersLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegistryUsersLocalService
 * @generated
 */
@ProviderType
public class RegistryUsersLocalServiceWrapper
	implements RegistryUsersLocalService,
			   ServiceWrapper<RegistryUsersLocalService> {

	public RegistryUsersLocalServiceWrapper(
		RegistryUsersLocalService registryUsersLocalService) {

		_registryUsersLocalService = registryUsersLocalService;
	}

	/**
	 * Adds the registry users to the database. Also notifies the appropriate model listeners.
	 *
	 * @param registryUsers the registry users
	 * @return the registry users that was added
	 */
	@Override
	public org.salvacomes.model.RegistryUsers addRegistryUsers(
		org.salvacomes.model.RegistryUsers registryUsers) {

		return _registryUsersLocalService.addRegistryUsers(registryUsers);
	}

	/**
	 * Creates a new registry users with the primary key. Does not add the registry users to the database.
	 *
	 * @param id the primary key for the new registry users
	 * @return the new registry users
	 */
	@Override
	public org.salvacomes.model.RegistryUsers createRegistryUsers(int id) {
		return _registryUsersLocalService.createRegistryUsers(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registryUsersLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the registry users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users that was removed
	 * @throws PortalException if a registry users with the primary key could not be found
	 */
	@Override
	public org.salvacomes.model.RegistryUsers deleteRegistryUsers(int id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registryUsersLocalService.deleteRegistryUsers(id);
	}

	/**
	 * Deletes the registry users from the database. Also notifies the appropriate model listeners.
	 *
	 * @param registryUsers the registry users
	 * @return the registry users that was removed
	 */
	@Override
	public org.salvacomes.model.RegistryUsers deleteRegistryUsers(
		org.salvacomes.model.RegistryUsers registryUsers) {

		return _registryUsersLocalService.deleteRegistryUsers(registryUsers);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _registryUsersLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registryUsersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>org.salvacomes.model.impl.RegistryUsersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _registryUsersLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>org.salvacomes.model.impl.RegistryUsersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _registryUsersLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _registryUsersLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _registryUsersLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public org.salvacomes.model.RegistryUsers fetchRegistryUsers(int id) {
		return _registryUsersLocalService.fetchRegistryUsers(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _registryUsersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _registryUsersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _registryUsersLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registryUsersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the registry users with the primary key.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users
	 * @throws PortalException if a registry users with the primary key could not be found
	 */
	@Override
	public org.salvacomes.model.RegistryUsers getRegistryUsers(int id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _registryUsersLocalService.getRegistryUsers(id);
	}

	/**
	 * Returns a range of all the registry userses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>org.salvacomes.model.impl.RegistryUsersModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of registry userses
	 * @param end the upper bound of the range of registry userses (not inclusive)
	 * @return the range of registry userses
	 */
	@Override
	public java.util.List<org.salvacomes.model.RegistryUsers>
		getRegistryUserses(int start, int end) {

		return _registryUsersLocalService.getRegistryUserses(start, end);
	}

	/**
	 * Returns the number of registry userses.
	 *
	 * @return the number of registry userses
	 */
	@Override
	public int getRegistryUsersesCount() {
		return _registryUsersLocalService.getRegistryUsersesCount();
	}

	/**
	 * Updates the registry users in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param registryUsers the registry users
	 * @return the registry users that was updated
	 */
	@Override
	public org.salvacomes.model.RegistryUsers updateRegistryUsers(
		org.salvacomes.model.RegistryUsers registryUsers) {

		return _registryUsersLocalService.updateRegistryUsers(registryUsers);
	}

	@Override
	public RegistryUsersLocalService getWrappedService() {
		return _registryUsersLocalService;
	}

	@Override
	public void setWrappedService(
		RegistryUsersLocalService registryUsersLocalService) {

		_registryUsersLocalService = registryUsersLocalService;
	}

	private RegistryUsersLocalService _registryUsersLocalService;

}