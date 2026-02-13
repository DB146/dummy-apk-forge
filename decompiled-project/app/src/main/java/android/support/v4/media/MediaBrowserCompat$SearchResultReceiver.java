package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import b.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends d {
    @Override // b.d
    public final void a(int i7, Bundle bundle) {
        if (bundle != null) {
            bundle = android.support.v4.media.session.b.H(bundle);
        }
        if (i7 != 0) {
            throw null;
        }
        if (bundle == null) {
            throw null;
        }
        if (!bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
