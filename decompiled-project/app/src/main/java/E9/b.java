package E9;

import kotlin.jvm.internal.l;
import m4.C1549C;
import m4.C1558a0;
import m4.C1562c0;
import m4.W;
import m4.q0;
import m4.u0;
import m4.v0;

/* loaded from: classes2.dex */
public final class b implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f3803a;

    public b(c cVar) {
        this.f3803a = cVar;
    }

    @Override // m4.v0
    public final void h(C1549C player, u0 u0Var) {
        C1558a0 k;
        W w10;
        l.e(player, "player");
        if (!u0Var.a(0, 3, 7, 11, 5) || (k = player.k()) == null) {
            return;
        }
        C1558a0 k7 = player.k();
        String message = "currentMediaItem: " + ((k7 == null || (w10 = k7.f20228f) == null) ? null : w10.f20189a);
        c t5 = this.f3803a;
        l.e(t5, "t");
        l.e(message, "message");
        if (player.j() <= 120000 || player.Q() <= 60000) {
            return;
        }
        long Q3 = player.Q();
        long j = player.j();
        W9.b type = c.c(k);
        l.e(type, "type");
        C1562c0 mediaMetadata = k.f20226d;
        l.d(mediaMetadata, "mediaMetadata");
        W requestMetadata = k.f20228f;
        l.d(requestMetadata, "requestMetadata");
        String mediaId = k.f20223a;
        l.d(mediaId, "mediaId");
        t5.f3806b.a(new W9.c(mediaId, String.valueOf(mediaMetadata.f20321c), String.valueOf(mediaMetadata.f20323e), String.valueOf(mediaMetadata.f20330z), Q3, j, false, String.valueOf(mediaMetadata.f20325u), String.valueOf(requestMetadata.f20189a), type, System.currentTimeMillis()), 10L);
    }

    @Override // m4.v0
    public final void i(q0 error) {
        String str;
        l.e(error, "error");
        this.f3803a.f3807c = null;
        String message = error.getMessage();
        if (message != null) {
            int i7 = error.f20477a;
            if (i7 == 5001) {
                str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
            } else if (i7 == 5002) {
                str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
            } else if (i7 == 7000) {
                str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
            } else if (i7 != 7001) {
                switch (i7) {
                    case 1000:
                        str = "ERROR_CODE_UNSPECIFIED";
                        break;
                    case 1001:
                        str = "ERROR_CODE_REMOTE_ERROR";
                        break;
                    case 1002:
                        str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                        break;
                    case 1003:
                        str = "ERROR_CODE_TIMEOUT";
                        break;
                    case 1004:
                        str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                        break;
                    default:
                        switch (i7) {
                            case 2000:
                                str = "ERROR_CODE_IO_UNSPECIFIED";
                                break;
                            case 2001:
                                str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                break;
                            case 2002:
                                str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                break;
                            case 2003:
                                str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                break;
                            case 2004:
                                str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                break;
                            case 2005:
                                str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                break;
                            case 2006:
                                str = "ERROR_CODE_IO_NO_PERMISSION";
                                break;
                            case 2007:
                                str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                break;
                            case 2008:
                                str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                break;
                            default:
                                switch (i7) {
                                    case 3001:
                                        str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                        break;
                                    case 3002:
                                        str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                        break;
                                    case 3003:
                                        str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                        break;
                                    case 3004:
                                        str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                        break;
                                    default:
                                        switch (i7) {
                                            case 4001:
                                                str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                break;
                                            case 4002:
                                                str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                break;
                                            case 4003:
                                                str = "ERROR_CODE_DECODING_FAILED";
                                                break;
                                            case 4004:
                                                str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                break;
                                            case 4005:
                                                str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                break;
                                            default:
                                                switch (i7) {
                                                    case 6000:
                                                        str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                        break;
                                                    case 6001:
                                                        str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                        break;
                                                    case 6002:
                                                        str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                        break;
                                                    case 6003:
                                                        str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                        break;
                                                    case 6004:
                                                        str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                        break;
                                                    case 6005:
                                                        str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                        break;
                                                    case 6006:
                                                        str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                        break;
                                                    case 6007:
                                                        str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                        break;
                                                    case 6008:
                                                        str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                        break;
                                                    default:
                                                        if (i7 < 1000000) {
                                                            str = "invalid error code";
                                                            break;
                                                        } else {
                                                            str = "custom error code";
                                                            break;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } else {
                str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
            }
            message.concat(str);
        }
    }

    @Override // m4.v0
    public final void n(boolean z8) {
    }

    @Override // m4.v0
    public final void v(int i7) {
        c t5 = this.f3803a;
        if (i7 == 1) {
            l.e(t5, "t");
            return;
        }
        if (i7 == 2) {
            l.e(t5, "t");
        } else if (i7 == 3) {
            l.e(t5, "t");
        } else {
            if (i7 != 4) {
                return;
            }
            l.e(t5, "t");
        }
    }
}
