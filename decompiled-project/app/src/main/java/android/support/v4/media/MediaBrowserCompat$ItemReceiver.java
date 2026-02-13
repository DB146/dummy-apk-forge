package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import b.d;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends d {
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
        if (!bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
