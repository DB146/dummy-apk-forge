package y1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* renamed from: y1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2357e implements InterfaceC2356d, InterfaceC2358f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26689a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f26690b;

    /* renamed from: c, reason: collision with root package name */
    public int f26691c;

    /* renamed from: d, reason: collision with root package name */
    public int f26692d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f26693e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f26694f;

    public /* synthetic */ C2357e() {
    }

    public C2357e(C2357e c2357e) {
        ClipData clipData = c2357e.f26690b;
        clipData.getClass();
        this.f26690b = clipData;
        int i7 = c2357e.f26691c;
        if (i7 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i7 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f26691c = i7;
        int i10 = c2357e.f26692d;
        if ((i10 & 1) == i10) {
            this.f26692d = i10;
            this.f26693e = c2357e.f26693e;
            this.f26694f = c2357e.f26694f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }

    @Override // y1.InterfaceC2356d
    public void a(Bundle bundle) {
        this.f26694f = bundle;
    }

    @Override // y1.InterfaceC2356d
    public void b(Uri uri) {
        this.f26693e = uri;
    }

    @Override // y1.InterfaceC2356d
    public C2359g build() {
        return new C2359g(new C2357e(this));
    }

    @Override // y1.InterfaceC2356d
    public void c(int i7) {
        this.f26692d = i7;
    }

    @Override // y1.InterfaceC2358f
    public ClipData e() {
        return this.f26690b;
    }

    @Override // y1.InterfaceC2358f
    public int f() {
        return this.f26692d;
    }

    @Override // y1.InterfaceC2358f
    public ContentInfo g() {
        return null;
    }

    @Override // y1.InterfaceC2358f
    public int i() {
        return this.f26691c;
    }

    public String toString() {
        String str;
        switch (this.f26689a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f26690b.getDescription());
                sb2.append(", source=");
                int i7 = this.f26691c;
                sb2.append(i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? String.valueOf(i7) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i10 = this.f26692d;
                sb2.append((i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10));
                Uri uri = this.f26693e;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return h3.o.p(sb2, this.f26694f != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }
}
