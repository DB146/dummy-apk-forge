package I2;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: I2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5128a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5129b;

    /* renamed from: c, reason: collision with root package name */
    public final U2.c f5130c;

    /* renamed from: d, reason: collision with root package name */
    public final D5.i f5131d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5132e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5133f;
    public final D g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f5134h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f5135i;
    public final Intent j;
    public final boolean k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5136l;

    /* renamed from: m, reason: collision with root package name */
    public final Set f5137m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5138n;

    /* renamed from: o, reason: collision with root package name */
    public final File f5139o;

    /* renamed from: p, reason: collision with root package name */
    public final Callable f5140p;

    /* renamed from: q, reason: collision with root package name */
    public final List f5141q;

    /* renamed from: r, reason: collision with root package name */
    public final List f5142r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5143s;

    /* renamed from: t, reason: collision with root package name */
    public final T2.b f5144t;

    /* renamed from: u, reason: collision with root package name */
    public final Hb.i f5145u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5146v;

    public C0313b(Context context, String str, U2.c cVar, D5.i migrationContainer, List list, boolean z8, D d10, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z10, boolean z11, Set set, String str2, File file, Callable callable, List typeConverters, List autoMigrationSpecs, boolean z12, T2.b bVar, Hb.i iVar) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(migrationContainer, "migrationContainer");
        kotlin.jvm.internal.l.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.l.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.l.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.l.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f5128a = context;
        this.f5129b = str;
        this.f5130c = cVar;
        this.f5131d = migrationContainer;
        this.f5132e = list;
        this.f5133f = z8;
        this.g = d10;
        this.f5134h = queryExecutor;
        this.f5135i = transactionExecutor;
        this.j = intent;
        this.k = z10;
        this.f5136l = z11;
        this.f5137m = set;
        this.f5138n = str2;
        this.f5139o = file;
        this.f5140p = callable;
        this.f5141q = typeConverters;
        this.f5142r = autoMigrationSpecs;
        this.f5143s = z12;
        this.f5144t = bVar;
        this.f5145u = iVar;
        this.f5146v = true;
    }
}
