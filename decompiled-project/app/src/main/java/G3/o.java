package G3;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class o implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4323a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f4324b;

    public o(Context context, int i7) {
        this.f4323a = i7;
        switch (i7) {
            case 1:
                this.f4324b = context.getApplicationContext();
                return;
            case 2:
                this.f4324b = context.getApplicationContext();
                return;
            default:
                this.f4324b = context;
                return;
        }
    }

    @Override // G3.s
    public final r a(Object obj, int i7, int i10, A3.l lVar) {
        Long l10;
        switch (this.f4323a) {
            case 0:
                Uri uri = (Uri) obj;
                return new r(new V3.d(uri), new n(0, this.f4324b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i7 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i7 > 512 || i10 > 384) {
                    return null;
                }
                V3.d dVar = new V3.d(uri2);
                Context context = this.f4324b;
                return new r(dVar, B3.b.c(context, uri2, new B3.a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i7 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i7 > 512 || i10 > 384 || (l10 = (Long) lVar.c(J3.G.f5453d)) == null || l10.longValue() != -1) {
                    return null;
                }
                V3.d dVar2 = new V3.d(uri3);
                Context context2 = this.f4324b;
                return new r(dVar2, B3.b.c(context2, uri3, new B3.a(context2.getContentResolver(), 1)));
        }
    }

    @Override // G3.s
    public final boolean b(Object obj) {
        switch (this.f4323a) {
            case 0:
                return com.bumptech.glide.c.G((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return com.bumptech.glide.c.G(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return com.bumptech.glide.c.G(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
