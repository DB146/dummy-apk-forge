package ib;

import Db.d;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import vc.i;

/* renamed from: ib.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1360b extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final List f18489a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18490b;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f18491c;

    public C1360b(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof C1360b) {
                    linkedHashSet.addAll(((C1360b) th).f18489a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (linkedHashSet.isEmpty()) {
            throw new IllegalArgumentException("errors is empty");
        }
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
        this.f18489a = unmodifiableList;
        this.f18490b = unmodifiableList.size() + " exceptions occurred. ";
    }

    public C1360b(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(i iVar, Throwable th, String str) {
        iVar.e(str).e(th).e('\n');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            iVar.e("\t\tat ").e(stackTraceElement).e('\n');
        }
        if (th.getCause() != null) {
            iVar.e("\tCaused by: ");
            a(iVar, th.getCause(), "");
        }
    }

    public final void b(i iVar) {
        iVar.e(this).e("\n");
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            iVar.e("\tat ").e(stackTraceElement).e("\n");
        }
        int i7 = 1;
        for (Throwable th : this.f18489a) {
            iVar.e("  ComposedException ").e(Integer.valueOf(i7)).e(" :\n");
            a(iVar, th, "\t");
            i7++;
        }
        iVar.e("\n");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        int i7;
        try {
            if (this.f18491c == null) {
                String property = System.getProperty("line.separator");
                if (this.f18489a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Multiple exceptions (");
                    sb2.append(this.f18489a.size());
                    sb2.append(")");
                    sb2.append(property);
                    for (Throwable th : this.f18489a) {
                        int i10 = 0;
                        while (true) {
                            if (th != null) {
                                for (int i11 = 0; i11 < i10; i11++) {
                                    sb2.append("  ");
                                }
                                sb2.append("|-- ");
                                sb2.append(th.getClass().getCanonicalName());
                                sb2.append(": ");
                                String message = th.getMessage();
                                if (message == null || !message.contains(property)) {
                                    sb2.append(message);
                                    sb2.append(property);
                                } else {
                                    sb2.append(property);
                                    for (String str : message.split(property)) {
                                        for (int i12 = 0; i12 < i10 + 2; i12++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append(str);
                                        sb2.append(property);
                                    }
                                }
                                int i13 = 0;
                                while (true) {
                                    i7 = i10 + 2;
                                    if (i13 >= i7) {
                                        break;
                                    }
                                    sb2.append("  ");
                                    i13++;
                                }
                                StackTraceElement[] stackTrace = th.getStackTrace();
                                if (stackTrace.length > 0) {
                                    sb2.append("at ");
                                    sb2.append(stackTrace[0]);
                                    sb2.append(property);
                                }
                                if (identityHashMap.containsKey(th)) {
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        for (int i14 = 0; i14 < i7; i14++) {
                                            sb2.append("  ");
                                        }
                                        sb2.append("|-- ");
                                        sb2.append("(cause not expanded again) ");
                                        sb2.append(cause.getClass().getCanonicalName());
                                        sb2.append(": ");
                                        sb2.append(cause.getMessage());
                                        sb2.append(property);
                                    }
                                } else {
                                    identityHashMap.put(th, Boolean.TRUE);
                                    th = th.getCause();
                                    i10++;
                                }
                            }
                        }
                    }
                    this.f18491c = new d(sb2.toString().trim(), 10);
                } else {
                    this.f18491c = (Throwable) this.f18489a.get(0);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f18491c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f18490b;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new C1359a(printStream, 0));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new C1359a(printWriter, 1));
    }
}
