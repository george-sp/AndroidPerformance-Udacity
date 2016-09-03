# Render
Course code repository for Udacity's "Android Performance" - **Lesson 1: Render**.

==================================================================================

### Quiz: Visualize And Fix Overdraw
On your mobile device:

1. Go to Settings > Developer Options 
2. Turn on Debug GPU Overdraw. 
3. In the popup, choose Show overdraw areas.

Full text tutorial: [Visualizing Overdraw QuickStart Tutorial](https://developer.android.com/studio/profile/dev-options-overdraw.html).

### Quiz: Apply clipRect and quickReject
**clipping**: one of the most important optimization performed by the Android framework when it knows that overdraw is a problem, and tries to avoid drawing UI widgets that may be invisible in the final image. 
- If you can determine an object will be fully obscured, there's no reason to go about drawing it.
- Sadly this technique doesn't extend itself to complex custom views, where you're overriding the `Canvas.onDraw()` method. _(In these cases, the underlying system doesn't have insight into how you're drawing your content, which makes it really hard for it to remove hidden views from your rendering pipeline.)_

**Useful Methods**
- **`Canvas.clipRect()`**: allows you to define the drawable boundaries for a given view, meaning that if any canvas drawing happens outside these boundaries, it'll be ignored.
- **`Canvas.quickReject()`**: tests whether a given area is completely outside the clipping rectangle, in which case you can skip all that drawing work.
