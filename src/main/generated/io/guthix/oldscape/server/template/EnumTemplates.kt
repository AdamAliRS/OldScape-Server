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
/* Dont EDIT! This file is automatically generated by io.guthix.oldscape.server.template.TemplateGenerator. */
@file:Suppress("PropertyName", "UNCHECKED_CAST", "LongLine")
package io.guthix.oldscape.server.template
import io.guthix.oldscape.cache.config.EnumConfig

object EnumTemplates : TemplateLoader<EnumTemplate<Any, Any>>() {
    val GAMEFRAME_FIXED_1129: Map<EnumConfig.Component, EnumConfig.Component> get() = get(1129) as Map<EnumConfig.Component, EnumConfig.Component>
    val GAMEFRAME_RESIZABLE_BOX_1130: Map<EnumConfig.Component, EnumConfig.Component> get() = get(1130) as Map<EnumConfig.Component, EnumConfig.Component>
    val GAMEFRAME_RESIZABLE_LINE_1131: Map<EnumConfig.Component, EnumConfig.Component> get() = get(1131) as Map<EnumConfig.Component, EnumConfig.Component>
    val GAMEFRAME_RESIZABLE_BLACKSCREEN_1132: Map<EnumConfig.Component, EnumConfig.Component> get() = get(1132) as Map<EnumConfig.Component, EnumConfig.Component>
    val NORMAL_SPELLBOOK_1982: Map<Int, Int> get() = get(1982) as Map<Int, Int>
    val ANCIENT_SPELLBOOK_1983: Map<Int, Int> get() = get(1983) as Map<Int, Int>
    val LUNAR_SPELLBOOK_1984: Map<Int, Int> get() = get(1984) as Map<Int, Int>
    val ARCHEUUS_SPELLBOOK_1985: Map<Int, Int> get() = get(1985) as Map<Int, Int>
    val SPELLBOOK_1981: Map<Int, Map<Int, Int>> get() = mapOf(
        0 to NORMAL_SPELLBOOK_1982,
        1 to ANCIENT_SPELLBOOK_1983,
        2 to LUNAR_SPELLBOOK_1984,
        3 to ARCHEUUS_SPELLBOOK_1985,
    )
}
