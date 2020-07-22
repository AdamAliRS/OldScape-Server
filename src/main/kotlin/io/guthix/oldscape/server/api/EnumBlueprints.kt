/*
 * This file is part of Guthix OldScape-Server.
 *
 * Guthix OldScape-Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Guthix OldScape-Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Guthix OldScape-Server. If not, see <https://www.gnu.org/licenses/>.
 */
package io.guthix.oldscape.server.api

import io.guthix.cache.js5.Js5Archive
import io.guthix.oldscape.cache.config.EnumConfig
import mu.KotlinLogging
import java.io.IOException

private val logger = KotlinLogging.logger { }

internal object EnumBlueprints {
    private lateinit var configs: Map<Int, EnumConfig<Any, Any>>

    operator fun get(index: Int): EnumConfig<Any, Any> = configs[index] ?: throw IOException(
        "Could not find enum $index."
    )

    fun load(archive: Js5Archive) {
        configs = EnumConfig.load(archive.readGroup(EnumConfig.id))
        logger.info { "Loaded ${configs.size} enums" }
    }
}