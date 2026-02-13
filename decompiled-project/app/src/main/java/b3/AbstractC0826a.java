package b3;

import android.content.ContentValues;
import android.net.Uri;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0826a extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public static final SimpleDateFormat f13814b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        f13814b = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT-0"));
    }

    public AbstractC0826a() {
        this.f3094a = new ContentValues();
    }

    public final void K(boolean z8) {
        ((ContentValues) this.f3094a).put("browsable", Integer.valueOf(z8 ? 1 : 0));
    }

    public final void L(Uri uri) {
        ((ContentValues) this.f3094a).put("intent_uri", uri == null ? null : uri.toString());
    }

    public final void M(Uri uri) {
        ((ContentValues) this.f3094a).put("logo_uri", uri == null ? null : uri.toString());
    }

    public final void N(Date date) {
        ((ContentValues) this.f3094a).put("release_date", f13814b.format(date));
    }

    public final void O(int i7) {
        ((ContentValues) this.f3094a).put("type", Integer.valueOf(i7));
    }
}
