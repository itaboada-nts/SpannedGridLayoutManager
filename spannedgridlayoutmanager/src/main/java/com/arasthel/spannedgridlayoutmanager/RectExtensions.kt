/*
 * Copyright © 2017 Jorge Martín Espinosa
 */

package com.arasthel.spannedgridlayoutmanager

import android.graphics.Rect

/**
 * Checks if this rectangle is adjacent to another rectangle (sharing an edge).
 *
 * Two rects are adjacent if they touch along one or more edges but do not overlap.
 *
 * @param rect The rect to check adjacency with
 * @return True if the rects are adjacent, false otherwise
 */
fun Rect.isAdjacentTo(rect: Rect): Boolean {
    return (this.right == rect.left
            || this.top == rect.bottom
            || this.left == rect.right
            || this.bottom == rect.top)
}

/**
 * Checks if this rectangle intersects with another rectangle.
 *
 * This is an extension function wrapping the built-in [Rect.intersects] method
 * to provide a more idiomatic Kotlin interface.
 *
 * @param rect The rect to check intersection with
 * @return True if the rects intersect (including touching edges), false otherwise
 */
fun Rect.intersects(rect: Rect): Boolean {
    return this.intersects(rect.left, rect.top, rect.right, rect.bottom)
}