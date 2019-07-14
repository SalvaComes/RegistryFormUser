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

package org.salvacomes.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import org.salvacomes.exception.NoSuchRegistryUsersException;
import org.salvacomes.model.RegistryUsers;
import org.salvacomes.model.impl.RegistryUsersImpl;
import org.salvacomes.model.impl.RegistryUsersModelImpl;
import org.salvacomes.service.persistence.RegistryUsersPersistence;
import org.salvacomes.service.persistence.impl.constants.SendMailUserPersistenceConstants;

/**
 * The persistence implementation for the registry users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = RegistryUsersPersistence.class)
@ProviderType
public class RegistryUsersPersistenceImpl
	extends BasePersistenceImpl<RegistryUsers>
	implements RegistryUsersPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RegistryUsersUtil</code> to access the registry users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RegistryUsersImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RegistryUsersPersistenceImpl() {
		setModelClass(RegistryUsers.class);

		setModelImplClass(RegistryUsersImpl.class);
		setModelPKClass(int.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "id_");

		setDBColumnNames(dbColumnNames);
	}

	/**
	 * Caches the registry users in the entity cache if it is enabled.
	 *
	 * @param registryUsers the registry users
	 */
	@Override
	public void cacheResult(RegistryUsers registryUsers) {
		entityCache.putResult(
			entityCacheEnabled, RegistryUsersImpl.class,
			registryUsers.getPrimaryKey(), registryUsers);

		registryUsers.resetOriginalValues();
	}

	/**
	 * Caches the registry userses in the entity cache if it is enabled.
	 *
	 * @param registryUserses the registry userses
	 */
	@Override
	public void cacheResult(List<RegistryUsers> registryUserses) {
		for (RegistryUsers registryUsers : registryUserses) {
			if (entityCache.getResult(
					entityCacheEnabled, RegistryUsersImpl.class,
					registryUsers.getPrimaryKey()) == null) {

				cacheResult(registryUsers);
			}
			else {
				registryUsers.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all registry userses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RegistryUsersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the registry users.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RegistryUsers registryUsers) {
		entityCache.removeResult(
			entityCacheEnabled, RegistryUsersImpl.class,
			registryUsers.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RegistryUsers> registryUserses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RegistryUsers registryUsers : registryUserses) {
			entityCache.removeResult(
				entityCacheEnabled, RegistryUsersImpl.class,
				registryUsers.getPrimaryKey());
		}
	}

	/**
	 * Creates a new registry users with the primary key. Does not add the registry users to the database.
	 *
	 * @param id the primary key for the new registry users
	 * @return the new registry users
	 */
	@Override
	public RegistryUsers create(int id) {
		RegistryUsers registryUsers = new RegistryUsersImpl();

		registryUsers.setNew(true);
		registryUsers.setPrimaryKey(id);

		return registryUsers;
	}

	/**
	 * Removes the registry users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users that was removed
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	@Override
	public RegistryUsers remove(int id) throws NoSuchRegistryUsersException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the registry users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the registry users
	 * @return the registry users that was removed
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	@Override
	public RegistryUsers remove(Serializable primaryKey)
		throws NoSuchRegistryUsersException {

		Session session = null;

		try {
			session = openSession();

			RegistryUsers registryUsers = (RegistryUsers)session.get(
				RegistryUsersImpl.class, primaryKey);

			if (registryUsers == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRegistryUsersException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(registryUsers);
		}
		catch (NoSuchRegistryUsersException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected RegistryUsers removeImpl(RegistryUsers registryUsers) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(registryUsers)) {
				registryUsers = (RegistryUsers)session.get(
					RegistryUsersImpl.class, registryUsers.getPrimaryKeyObj());
			}

			if (registryUsers != null) {
				session.delete(registryUsers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (registryUsers != null) {
			clearCache(registryUsers);
		}

		return registryUsers;
	}

	@Override
	public RegistryUsers updateImpl(RegistryUsers registryUsers) {
		boolean isNew = registryUsers.isNew();

		Session session = null;

		try {
			session = openSession();

			if (registryUsers.isNew()) {
				session.save(registryUsers);

				registryUsers.setNew(false);
			}
			else {
				registryUsers = (RegistryUsers)session.merge(registryUsers);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(
			entityCacheEnabled, RegistryUsersImpl.class,
			registryUsers.getPrimaryKey(), registryUsers, false);

		registryUsers.resetOriginalValues();

		return registryUsers;
	}

	/**
	 * Returns the registry users with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the registry users
	 * @return the registry users
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	@Override
	public RegistryUsers findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRegistryUsersException {

		RegistryUsers registryUsers = fetchByPrimaryKey(primaryKey);

		if (registryUsers == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRegistryUsersException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return registryUsers;
	}

	/**
	 * Returns the registry users with the primary key or throws a <code>NoSuchRegistryUsersException</code> if it could not be found.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users
	 * @throws NoSuchRegistryUsersException if a registry users with the primary key could not be found
	 */
	@Override
	public RegistryUsers findByPrimaryKey(int id)
		throws NoSuchRegistryUsersException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the registry users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the registry users
	 * @return the registry users, or <code>null</code> if a registry users with the primary key could not be found
	 */
	@Override
	public RegistryUsers fetchByPrimaryKey(int id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the registry userses.
	 *
	 * @return the registry userses
	 */
	@Override
	public List<RegistryUsers> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<RegistryUsers> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<RegistryUsers> findAll(
		int start, int end,
		OrderByComparator<RegistryUsers> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<RegistryUsers> findAll(
		int start, int end, OrderByComparator<RegistryUsers> orderByComparator,
		boolean retrieveFromCache) {

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			pagination = false;
			finderPath = _finderPathWithoutPaginationFindAll;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<RegistryUsers> list = null;

		if (retrieveFromCache) {
			list = (List<RegistryUsers>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REGISTRYUSERS);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REGISTRYUSERS;

				if (pagination) {
					sql = sql.concat(RegistryUsersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RegistryUsers>)QueryUtil.list(
						q, getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RegistryUsers>)QueryUtil.list(
						q, getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the registry userses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RegistryUsers registryUsers : findAll()) {
			remove(registryUsers);
		}
	}

	/**
	 * Returns the number of registry userses.
	 *
	 * @return the number of registry userses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REGISTRYUSERS);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_REGISTRYUSERS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RegistryUsersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the registry users persistence.
	 */
	@Activate
	public void activate() {
		RegistryUsersModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		RegistryUsersModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RegistryUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, RegistryUsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	}

	@Deactivate
	public void deactivate() {
		entityCache.removeCache(RegistryUsersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	@Reference(
		target = SendMailUserPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.org.salvacomes.model.RegistryUsers"),
			true);
	}

	@Override
	@Reference(
		target = SendMailUserPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SendMailUserPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_REGISTRYUSERS =
		"SELECT registryUsers FROM RegistryUsers registryUsers";

	private static final String _SQL_COUNT_REGISTRYUSERS =
		"SELECT COUNT(registryUsers) FROM RegistryUsers registryUsers";

	private static final String _ORDER_BY_ENTITY_ALIAS = "registryUsers.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RegistryUsers exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RegistryUsersPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id"});

}