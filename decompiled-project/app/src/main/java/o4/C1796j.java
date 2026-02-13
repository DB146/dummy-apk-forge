package o4;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: o4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1796j extends AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1798l f21851a;

    public C1796j(C1798l c1798l) {
        this.f21851a = c1798l;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C1798l c1798l = this.f21851a;
        C1798l.a(c1798l, C1794h.b((Context) c1798l.f21856b));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C1798l c1798l = this.f21851a;
        C1798l.a(c1798l, C1794h.b((Context) c1798l.f21856b));
    }
}
