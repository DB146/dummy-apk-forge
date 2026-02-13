package A1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f333a;

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f333a = new InputContentInfo(uri, clipDescription, uri2);
    }

    public g(Object obj) {
        this.f333a = (InputContentInfo) obj;
    }

    @Override // A1.h
    public final ClipDescription getDescription() {
        return this.f333a.getDescription();
    }

    @Override // A1.h
    public final Object n() {
        return this.f333a;
    }

    @Override // A1.h
    public final Uri o() {
        return this.f333a.getContentUri();
    }

    @Override // A1.h
    public final void r() {
        this.f333a.requestPermission();
    }

    @Override // A1.h
    public final Uri u() {
        return this.f333a.getLinkUri();
    }
}
