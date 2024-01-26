package com.kingchampion36.prometheus.and.grafana.metrics

import io.github.oshai.kotlinlogging.KotlinLogging
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class MetricsPublisher(private val meterRegistry: MeterRegistry) {

  companion object {
    private const val TEST_METRIC = "test_metric"
    private val log = KotlinLogging.logger { }
  }

  @Scheduled(initialDelay = 3000, fixedDelay = 2000)
  fun publishMetrics() {
    meterRegistry.counter(TEST_METRIC).increment()
    log.info { "Metric $TEST_METRIC count has been incremented" }
  }
}
