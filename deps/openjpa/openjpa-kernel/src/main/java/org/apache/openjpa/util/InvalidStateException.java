/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.    
 */
package org.apache.openjpa.util;

import org.apache.openjpa.lib.util.Localizer.Message;

/**
 * Exception type thrown when attempting to execute an operation that
 * is not allowed by the current state.
 *
 * @since 0.4.0
 * @author Abe White
 */
public class InvalidStateException
    extends UserException {

    public InvalidStateException(Message msg) {
        super(msg);
    }

    public InvalidStateException(Message msg, Object failed) {
        super(msg);
        setFailedObject(failed);
    }

    public int getSubtype() {
        return INVALID_STATE;
    }
}
