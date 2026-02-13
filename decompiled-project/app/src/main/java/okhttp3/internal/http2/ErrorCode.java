package okhttp3.internal.http2;

import Z9.x;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ErrorCode {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f22721b;

    /* renamed from: c, reason: collision with root package name */
    public static final ErrorCode f22722c;

    /* renamed from: d, reason: collision with root package name */
    public static final ErrorCode f22723d;

    /* renamed from: e, reason: collision with root package name */
    public static final ErrorCode f22724e;

    /* renamed from: f, reason: collision with root package name */
    public static final ErrorCode f22725f;

    /* renamed from: u, reason: collision with root package name */
    public static final ErrorCode f22726u;

    /* renamed from: v, reason: collision with root package name */
    public static final ErrorCode f22727v;

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ ErrorCode[] f22728w;

    /* renamed from: a, reason: collision with root package name */
    public final int f22729a;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        ErrorCode errorCode = new ErrorCode("NO_ERROR", 0, 0);
        f22722c = errorCode;
        ErrorCode errorCode2 = new ErrorCode("PROTOCOL_ERROR", 1, 1);
        f22723d = errorCode2;
        ErrorCode errorCode3 = new ErrorCode("INTERNAL_ERROR", 2, 2);
        f22724e = errorCode3;
        ErrorCode errorCode4 = new ErrorCode("FLOW_CONTROL_ERROR", 3, 3);
        f22725f = errorCode4;
        ErrorCode errorCode5 = new ErrorCode("SETTINGS_TIMEOUT", 4, 4);
        ErrorCode errorCode6 = new ErrorCode("STREAM_CLOSED", 5, 5);
        ErrorCode errorCode7 = new ErrorCode("FRAME_SIZE_ERROR", 6, 6);
        ErrorCode errorCode8 = new ErrorCode("REFUSED_STREAM", 7, 7);
        f22726u = errorCode8;
        ErrorCode errorCode9 = new ErrorCode("CANCEL", 8, 8);
        f22727v = errorCode9;
        ErrorCode[] errorCodeArr = {errorCode, errorCode2, errorCode3, errorCode4, errorCode5, errorCode6, errorCode7, errorCode8, errorCode9, new ErrorCode("COMPRESSION_ERROR", 9, 9), new ErrorCode("CONNECT_ERROR", 10, 10), new ErrorCode("ENHANCE_YOUR_CALM", 11, 11), new ErrorCode("INADEQUATE_SECURITY", 12, 12), new ErrorCode("HTTP_1_1_REQUIRED", 13, 13)};
        f22728w = errorCodeArr;
        x.k(errorCodeArr);
        f22721b = new Companion(0);
    }

    public ErrorCode(String str, int i7, int i10) {
        this.f22729a = i10;
    }

    public static ErrorCode valueOf(String str) {
        return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
    }

    public static ErrorCode[] values() {
        return (ErrorCode[]) f22728w.clone();
    }
}
