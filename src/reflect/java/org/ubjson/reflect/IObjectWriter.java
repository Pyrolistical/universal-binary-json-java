/**   
 * Copyright 2011 The Buzz Media, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ubjson.reflect;

import java.io.IOException;

import org.ubjson.UBJOutputStream;

public interface IObjectWriter {
	public enum AccessType {
		FIELDS, METHODS
	}

	public void reset();

	public void writeObject(UBJOutputStream out, Object obj)
			throws IllegalArgumentException, IOException;

	public void writeObject(UBJOutputStream out, Object obj,
			boolean compactNumberStorage) throws IllegalArgumentException,
			IOException;

	public void writeObject(UBJOutputStream out, Object obj, AccessType type)
			throws IllegalArgumentException, IOException;

	public void writeObject(UBJOutputStream out, Object obj, AccessType type,
			boolean compactNumberStorage) throws IllegalArgumentException,
			IOException;
}