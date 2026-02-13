package l3;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import h3.C1235A;
import h3.z;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1483b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f19248d = z.g("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f19249a;

    /* renamed from: b, reason: collision with root package name */
    public final C1235A f19250b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19251c;

    public C1483b(Context context, C1235A c1235a, boolean z8) {
        this.f19250b = c1235a;
        this.f19249a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f19251c = z8;
    }
}
