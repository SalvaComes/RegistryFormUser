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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class RegistryUsersSoap implements Serializable {

	public static RegistryUsersSoap toSoapModel(RegistryUsers model) {
		RegistryUsersSoap soapModel = new RegistryUsersSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setLastName(model.getLastName());
		soapModel.setBirthday(model.getBirthday());
		soapModel.setEmail(model.getEmail());
		soapModel.setRegistryDate(model.getRegistryDate());

		return soapModel;
	}

	public static RegistryUsersSoap[] toSoapModels(RegistryUsers[] models) {
		RegistryUsersSoap[] soapModels = new RegistryUsersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RegistryUsersSoap[][] toSoapModels(RegistryUsers[][] models) {
		RegistryUsersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RegistryUsersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RegistryUsersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RegistryUsersSoap[] toSoapModels(List<RegistryUsers> models) {
		List<RegistryUsersSoap> soapModels = new ArrayList<RegistryUsersSoap>(
			models.size());

		for (RegistryUsers model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RegistryUsersSoap[soapModels.size()]);
	}

	public RegistryUsersSoap() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int pk) {
		setId(pk);
	}

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_id = id;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public Date getBirthday() {
		return _birthday;
	}

	public void setBirthday(Date birthday) {
		_birthday = birthday;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getRegistryDate() {
		return _registryDate;
	}

	public void setRegistryDate(Date registryDate) {
		_registryDate = registryDate;
	}

	private int _id;
	private String _name;
	private String _lastName;
	private Date _birthday;
	private String _email;
	private Date _registryDate;

}