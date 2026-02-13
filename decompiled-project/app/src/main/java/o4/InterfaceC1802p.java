package o4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1802p {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f21871a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    ByteBuffer a();

    C1800n b(C1800n c1800n);

    void c();

    boolean d();

    void e(ByteBuffer byteBuffer);

    void flush();

    boolean isActive();

    void reset();
}
