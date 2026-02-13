package c8;

import a8.InterfaceC0789f;
import a8.InterfaceC0790g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c implements InterfaceC0789f {

    /* renamed from: a, reason: collision with root package name */
    public static final SimpleDateFormat f14442a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f14442a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // a8.InterfaceC0784a
    public final void a(Object obj, Object obj2) {
        ((InterfaceC0790g) obj2).d(f14442a.format((Date) obj));
    }
}
