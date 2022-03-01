package com.softtek.services;

import com.softtek.enums.NcStageTopicPrefix;


/**
 * @author geekeryoung
 * @date 2022/3/1
 * <p>
 * topic 生成服务
 */
public class NcTopicGenerateService {

    public static String generatePreprocessorTopic(Integer appId) {
        return NcStageTopicPrefix.PREPROCESSOR.getTopic() + "_" + appId.toString();
    }

    public static String generateSchedulerTopic(Integer appId) {
        return NcStageTopicPrefix.SCHEDULER.getTopic() + "_" + appId.toString();
    }

    public static String generateSchedulerCsvTopic(Integer appId) {
        return NcStageTopicPrefix.SCHEDULER_CSV.getTopic() + "_" + appId.toString();
    }

    public static String generateGatewayAdapterTopic(Integer appId, Integer msgTypeId) {
        return NcStageTopicPrefix.GATEWAY_ADAPTER.getTopic() + "_" + appId.toString() + "_" + msgTypeId.toString();
    }

    public static String generateCallbackClientTopic(Integer appId, Integer msgTypeId) {
        return NcStageTopicPrefix.CALLBACK_CLIENT.getTopic() + "_" + appId.toString() + "_" + msgTypeId.toString();
    }

    public static String generateCallbackPreprocessorTopic(Integer msgTypeId) {
        return NcStageTopicPrefix.GATEWAY_ADAPTER.getTopic() + "_" + msgTypeId.toString();
    }

}
