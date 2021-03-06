/*
 * Copyright 2018-2020 Guthix
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.guthix.oldscape.server.net.login

enum class LoginType(val opcode: Int) {
    UNKOWN_LOGIN(14),
    UNKOWN_LOGIN2(15),
    NEW_LOGIN_CONNECTION(16),
    RECONNECT_LOGIN_CONNECTION(18);

    companion object {
        fun find(opcode: Int): LoginType = values().first { it.opcode == opcode }
    }
}