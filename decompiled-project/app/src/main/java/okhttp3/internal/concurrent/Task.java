package okhttp3.internal.concurrent;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public abstract class Task {

    /* renamed from: a, reason: collision with root package name */
    public final String f22507a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22508b;

    /* renamed from: c, reason: collision with root package name */
    public TaskQueue f22509c;

    /* renamed from: d, reason: collision with root package name */
    public long f22510d;

    public Task(String name, boolean z8) {
        l.e(name, "name");
        this.f22507a = name;
        this.f22508b = z8;
        this.f22510d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f22507a;
    }
}
