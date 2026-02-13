package ca;

import Eb.v;
import Eb.w;
import G8.m;
import R9.b;
import X.c;
import android.content.SharedPreferences;
import com.kt.apps.core.tv.model.TVChannel;
import com.kt.apps.core.tv.model.TVDataSourceFrom;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

/* renamed from: ca.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0918a extends b {

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f14463b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0918a(SharedPreferences sharedPreferences) {
        super(sharedPreferences);
        l.e(sharedPreferences, "sharedPreferences");
        this.f14463b = sharedPreferences;
    }

    public final Map c(TVDataSourceFrom sourceFrom) {
        l.e(sourceFrom, "sourceFrom");
        N8.a a9 = N8.a.a(Map.class, String.class, String.class);
        m mVar = new m();
        String string = this.f14463b.getString(c.h(sourceFrom.name(), "_cookies"), null);
        if (string == null) {
            return w.f3892a;
        }
        Object c10 = mVar.c(string, a9.f7387b);
        l.d(c10, "fromJson(...)");
        return (Map) c10;
    }

    public final List d(String group) {
        l.e(group, "group");
        List list = (List) new m().c((String) a(String.class, group), N8.a.a(List.class, TVChannel.class).f7387b);
        return list == null ? v.f3891a : list;
    }

    public final void e(String str, List value) {
        l.e(value, "value");
        this.f14463b.edit().putString(str, new m().f(value)).apply();
    }
}
