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

package org.salvacomes.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

import org.salvacomes.model.RegistryUsers;

/**
 * The cache model class for representing RegistryUsers in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class RegistryUsersCacheModel
	implements CacheModel<RegistryUsers>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RegistryUsersCacheModel)) {
			return false;
		}

		RegistryUsersCacheModel registryUsersCacheModel =
			(RegistryUsersCacheModel)obj;

		if (id == registryUsersCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", birthday=");
		sb.append(birthday);
		sb.append(", email=");
		sb.append(email);
		sb.append(", registryDate=");
		sb.append(registryDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RegistryUsers toEntityModel() {
		RegistryUsersImpl registryUsersImpl = new RegistryUsersImpl();

		registryUsersImpl.setId(id);

		if (name == null) {
			registryUsersImpl.setName("");
		}
		else {
			registryUsersImpl.setName(name);
		}

		if (lastName == null) {
			registryUsersImpl.setLastName("");
		}
		else {
			registryUsersImpl.setLastName(lastName);
		}

		if (birthday == Long.MIN_VALUE) {
			registryUsersImpl.setBirthday(null);
		}
		else {
			registryUsersImpl.setBirthday(new Date(birthday));
		}

		if (email == null) {
			registryUsersImpl.setEmail("");
		}
		else {
			registryUsersImpl.setEmail(email);
		}

		if (registryDate == Long.MIN_VALUE) {
			registryUsersImpl.setRegistryDate(null);
		}
		else {
			registryUsersImpl.setRegistryDate(new Date(registryDate));
		}

		registryUsersImpl.resetOriginalValues();

		return registryUsersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readInt();
		name = objectInput.readUTF();
		lastName = objectInput.readUTF();
		birthday = objectInput.readLong();
		email = objectInput.readUTF();
		registryDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeInt(id);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		objectOutput.writeLong(birthday);

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		objectOutput.writeLong(registryDate);
	}

	public int id;
	public String name;
	public String lastName;
	public long birthday;
	public String email;
	public long registryDate;

}