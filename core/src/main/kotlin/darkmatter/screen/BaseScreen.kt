package darkmatter.screen

import com.badlogic.gdx.graphics.g2d.Batch
import darkmatter.DarkMatter
import ktx.app.KtxScreen

abstract class BaseScreen(val game: DarkMatter, val batch: Batch = game.batch) : KtxScreen