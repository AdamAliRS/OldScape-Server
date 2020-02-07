package io.guthix.oldscape.server.dev

import io.guthix.oldscape.server.event.imp.ClientCheatEvent
import io.guthix.oldscape.server.world.entity.Obj
import io.guthix.oldscape.server.api.blueprint.ObjectBlueprints
import io.guthix.oldscape.server.world.mapsquare.zone.tile.Tile
import io.guthix.oldscape.server.world.mapsquare.zone.tile.tiles

on(ClientCheatEvent::class).where { event.string == "drop" }.then {
    world.map.addObject(
        Tile(
            player.position.floor, player.position.x + 1.tiles, player.position.y+ 1.tiles
        ),
        Obj(ObjectBlueprints[1753], 1)
    )
}

on(ClientCheatEvent::class).where { event.string == "pickup" }.then {
    world.map.removeObject(
        Tile(
            player.position.floor, player.position.x + 1.tiles, player.position.y+ 1.tiles
        ),
        Obj(ObjectBlueprints[1753], 1)
    )
}