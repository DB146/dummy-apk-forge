package y1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2355c implements InterfaceC2356d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26687a;

    public C2355c() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f26687a = new z1.f(this);
        } else {
            this.f26687a = new z1.f(this);
        }
    }

    public C2355c(ClipData clipData, int i7) {
        this.f26687a = n5.s.f(clipData, i7);
    }

    public /* synthetic */ C2355c(Object obj) {
        this.f26687a = obj;
    }

    public static C2355c g(int i7, int i10, int i11) {
        return new C2355c(AccessibilityNodeInfo.CollectionInfo.obtain(i7, i10, false, i11));
    }

    @Override // y1.InterfaceC2356d
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f26687a).setExtras(bundle);
    }

    @Override // y1.InterfaceC2356d
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f26687a).setLinkUri(uri);
    }

    @Override // y1.InterfaceC2356d
    public C2359g build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f26687a).build();
        return new C2359g(new o7.o(build));
    }

    @Override // y1.InterfaceC2356d
    public void c(int i7) {
        ((ContentInfo.Builder) this.f26687a).setFlags(i7);
    }

    public void d(int i7, z1.e eVar, String str, Bundle bundle) {
    }

    public z1.e e(int i7) {
        return null;
    }

    public z1.e f(int i7) {
        return null;
    }

    public boolean h(int i7, int i10, Bundle bundle) {
        return false;
    }
}
