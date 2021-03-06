/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zeromq;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class zmq_pollitem_t extends Structure {
	public Pointer socket;
	public int fd;
	public short events;
	public short revents;
	@Override
	protected List<String> getFieldOrder() {
	    // TODO Auto-generated method stub
	    return Arrays.asList(new String[] {
                "socket", "fd", "events", "revents"
            });
	}
}
