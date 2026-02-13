package o4;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import i1.C1290a;
import l2.X;
import m4.C1550D;

/* loaded from: classes.dex */
public final class H extends AudioTrack$StreamEventCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f21693a;

    public H(X x2) {
        this.f21693a = x2;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        I i10;
        C1290a c1290a;
        C1550D c1550d;
        if (audioTrack.equals(((I) this.f21693a.f19196d).f21746v) && (c1290a = (i10 = (I) this.f21693a.f19196d).f21742r) != null && i10.f21717V && (c1550d = ((L) c1290a.f18187b).f21763d1) != null) {
            c1550d.f19880a.f19951v.d(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        I i7;
        C1290a c1290a;
        C1550D c1550d;
        if (audioTrack.equals(((I) this.f21693a.f19196d).f21746v) && (c1290a = (i7 = (I) this.f21693a.f19196d).f21742r) != null && i7.f21717V && (c1550d = ((L) c1290a.f18187b).f21763d1) != null) {
            c1550d.f19880a.f19951v.d(2);
        }
    }
}
