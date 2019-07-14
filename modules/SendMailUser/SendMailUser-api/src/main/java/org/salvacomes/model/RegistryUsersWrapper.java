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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <p>
 * This class is a wrapper for {@link RegistryUsers}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistryUsers
 * @generated
 */
@ProviderType
public class RegistryUsersWrapper
	extends BaseModelWrapper<RegistryUsers>
	implements RegistryUsers, ModelWrapper<RegistryUsers> {

	public RegistryUsersWrapper(RegistryUsers registryUsers) {
		super(registryUsers);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("lastName", getLastName());
		attributes.put("birthday", getBirthday());
		attributes.put("email", getEmail());
		attributes.put("registryDate", getRegistryDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		Date birthday = (Date)attributes.get("birthday");

		if (birthday != null) {
			setBirthday(birthday);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		Date registryDate = (Date)attributes.get("registryDate");

		if (registryDate != null) {
			setRegistryDate(registryDate);
		}
	}

	/**
	 * Returns the birthday of this registry users.
	 *
	 * @return the birthday of this registry users
	 */
	@Override
	public Date getBirthday() {
		return model.getBirthday();
	}

	/**
	 * Returns the email of this registry users.
	 *
	 * @return the email of this registry users
	 */
	@Override
	public String getEmail() {
		return model.getEmail();
	}

	/**
	 * Returns the ID of this registry users.
	 *
	 * @return the ID of this registry users
	 */
	@Override
	public int getId() {
		return model.getId();
	}

	/**
	 * Returns the last name of this registry users.
	 *
	 * @return the last name of this registry users
	 */
	@Override
	public String getLastName() {
		return model.getLastName();
	}

	/**
	 * Returns the name of this registry users.
	 *
	 * @return the name of this registry users
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the primary key of this registry users.
	 *
	 * @return the primary key of this registry users
	 */
	@Override
	public int getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the registry date of this registry users.
	 *
	 * @return the registry date of this registry users
	 */
	@Override
	public Date getRegistryDate() {
		return model.getRegistryDate();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the birthday of this registry users.
	 *
	 * @param birthday the birthday of this registry users
	 */
	@Override
	public void setBirthday(Date birthday) {
		model.setBirthday(birthday);
	}

	/**
	 * Sets the email of this registry users.
	 *
	 * @param email the email of this registry users
	 */
	@Override
	public void setEmail(String email) {
		model.setEmail(email);
	}

	/**
	 * Sets the ID of this registry users.
	 *
	 * @param id the ID of this registry users
	 */
	@Override
	public void setId(int id) {
		model.setId(id);
	}

	/**
	 * Sets the last name of this registry users.
	 *
	 * @param lastName the last name of this registry users
	 */
	@Override
	public void setLastName(String lastName) {
		model.setLastName(lastName);
	}

	/**
	 * Sets the name of this registry users.
	 *
	 * @param name the name of this registry users
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the primary key of this registry users.
	 *
	 * @param primaryKey the primary key of this registry users
	 */
	@Override
	public void setPrimaryKey(int primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the registry date of this registry users.
	 *
	 * @param registryDate the registry date of this registry users
	 */
	@Override
	public void setRegistryDate(Date registryDate) {
		model.setRegistryDate(registryDate);
	}

	@Override
	protected RegistryUsersWrapper wrap(RegistryUsers registryUsers) {
		return new RegistryUsersWrapper(registryUsers);
	}

}